package com.cclabdis.bootcamp.exceptions;

import com.cclabdis.bootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
