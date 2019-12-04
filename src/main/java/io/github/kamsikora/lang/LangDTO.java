package io.github.kamsikora.lang;

class LangDTO {
    private Long id;
    private String code;

    public LangDTO(Lang lang) {
        this.id = lang.getId();
        this.code = lang.getCode();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
