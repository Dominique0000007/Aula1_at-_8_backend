package com.jogo.genio.model;

import jakarta.persistence.GenerationType;

public @interface GenerateValue {

	GenerationType strategy();

}
