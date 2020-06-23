package com.studio.api;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.studio.database.DBform;
import com.studio.domain.formPi;



@Controller
public class ClientesControler {
	
	private formPi usuarioLogado;
	
	@Autowired
	private DBform dBform;
	


	@RequestMapping(value = "/studio/registrar",method = RequestMethod.GET)
	public ModelAndView setupListaForm() {

		ModelAndView modelAndView = new ModelAndView("formulario");
		modelAndView.addObject("contato", new formPi());
		return modelAndView;
	}
	

	@RequestMapping(value = "/studio/save", method = RequestMethod.POST)
    public String cadastrar(formPi form) {
        formPi formPiCadastrado = dBform.save(form);
        if (usuarioLogado.getTipousuario() == 0) {
            return "redirect:/studio/lista/" + usuarioLogado.getId();
        }
        return "redirect:/studio/lista/" + formPiCadastrado.getId();
    }

    public formPi getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(formPi usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}

