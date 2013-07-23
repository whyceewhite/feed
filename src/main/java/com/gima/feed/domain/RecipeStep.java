package com.gima.feed.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="recipe_step")
public class RecipeStep extends AbstractEntity {

   private static final long serialVersionUID = 1L;
   
   @ManyToOne(optional=false)
   @JoinColumn(name="recipe_id", nullable=false, updatable=false)
   private Recipe recipe;
   
   @Column(name="sort_order", precision=5, nullable=false)
   private Integer sortOrder;
   
   @Column(name="text", nullable=false)
   private String text;
}
