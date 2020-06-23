package com.studio.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.studio.database.DBform;
import com.studio.domain.formPi;

@Controller
public class IndexControler {

	private formPi usuarioLogado;
	
	private long idUsu;

	@Autowired
	private DBform dBform;

	@RequestMapping(value = "/studio/lista/{id}", method = RequestMethod.GET)
	public ModelAndView carregamentoPagina(@PathVariable("id") Long id) {
		
		formPi formPi = dBform.findById(id).get();

		List<formPi> contatos = new ArrayList<>();
		if (formPi.getTipousuario() == 0) {
			contatos = dBform.findAll();
			idUsu = formPi.getId();
		} else {
			idUsu = -1;
			contatos = Arrays.asList(dBform.findById(id).get());
		}

		ModelAndView modelAndView = new ModelAndView("listaContatos");
		modelAndView.addObject("listaContato", contatos);
		return modelAndView;
	}

	@RequestMapping(value = "/studio/delete", method = RequestMethod.POST)
	public String excluir(@RequestParam("contatoID") Long contatoID) {

		dBform.deleteById(contatoID);		
		
		return "redirect:/studio/lista/" + idUsu;
	}

	@RequestMapping(value = "/studio/editar", method = RequestMethod.POST)
	public ModelAndView carregandoDadosEdicao(@RequestParam("contatoID") Long contatoID) {

		Optional<formPi> useObject = dBform.findById(contatoID);

		ModelAndView modelAndView = new ModelAndView("formulario");
		modelAndView.addObject("contato", useObject.get());
		return modelAndView;
	}

	@RequestMapping(value = "/studio/lista", method = RequestMethod.POST)
	public String cadastro() {
		return "redirect:/studio/registrar";
	}

	public long getIdAdm() {
		return idUsu;
	}

	public void setIdAdm(long idAdm) {
		this.idUsu = idAdm;
	}

    public formPi getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(formPi usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

}


