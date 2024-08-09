package com.example.ex10_validation_utils;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator{
    
    @Override
    public boolean supports(Class<?> arg0) {
        return ContentDTO.class.isAssignableFrom(arg0);
    }

    @Override
    public void validate(Object obj, Errors errors) {

        ContentDTO dto = (ContentDTO) obj;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "writer", "Writer.required", "Writer is required");
        /*String swriter = dto.getWriter();
        if (swriter == null || swriter.trim().isEmpty()) {
            System.out.println("Writer is null or empty");
            errors.rejectValue("writer", "trouble", "Writer is required.");
        }*/

        String sWriter = dto.getWriter();
        if (sWriter.length() < 3) {
            errors.rejectValue("writer", "writer.tooShort", "Writer is too short.");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "content", "Content.required","Content is required");
        /*String sContent = dto.getContent();
        if(sContent == null || sContent.trim().isEmpty()) {
            System.out.println("Content is null or empty");
            errors.rejectValue("content", "trouble", "Content is required.");

        }*/
    }
}
