package com.tomcat.model;

public class TbHongbaoBorrow {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tb_hongbao_borrow.id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tb_hongbao_borrow.hongbao_id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private Long hongbaoId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tb_hongbao_borrow.borrow_type
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private Integer borrowType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tb_hongbao_borrow.status
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private Integer status;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tb_hongbao_borrow.id
     *
     * @return the value of tb_hongbao_borrow.id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tb_hongbao_borrow.id
     *
     * @param id the value for tb_hongbao_borrow.id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tb_hongbao_borrow.hongbao_id
     *
     * @return the value of tb_hongbao_borrow.hongbao_id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public Long getHongbaoId() {
        return hongbaoId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tb_hongbao_borrow.hongbao_id
     *
     * @param hongbaoId the value for tb_hongbao_borrow.hongbao_id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setHongbaoId(Long hongbaoId) {
        this.hongbaoId = hongbaoId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tb_hongbao_borrow.borrow_type
     *
     * @return the value of tb_hongbao_borrow.borrow_type
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public Integer getBorrowType() {
        return borrowType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tb_hongbao_borrow.borrow_type
     *
     * @param borrowType the value for tb_hongbao_borrow.borrow_type
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setBorrowType(Integer borrowType) {
        this.borrowType = borrowType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tb_hongbao_borrow.status
     *
     * @return the value of tb_hongbao_borrow.status
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tb_hongbao_borrow.status
     *
     * @param status the value for tb_hongbao_borrow.status
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}