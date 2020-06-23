package com.studio.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.studio.database.DBform;
import com.studio.domain.formPi;

@Controller
public class LoginControler {

	private formPi usuarioLogado;
	
	@Autowired
	private DBform dBform;
	
	@Autowired
    private IndexControler IndexControler;

    @Autowired
    private ClientesControler cadastroControler;

	@RequestMapping(value = "/studio/login", method = RequestMethod.GET)
	public ModelAndView telaInicial() {
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("contato", new formPi());
		return modelAndView;
	}


	@RequestMapping(value = "/studio/login", method = RequestMethod.POST)
    public String logar(formPi form) {
        Optional<formPi> formPi = dBform.findByUsuarioAndSenha(form.getUsuario(), form.getSenha());
        if (formPi.isPresent()) {
            cadastroControler.setUsuarioLogado(formPi.get());
            IndexControler.setUsuarioLogado(formPi.get());
            return "redirect:/studio/lista/" + formPi.get().getId();
        }
        return "redirect:/studio/login";

    }

}
