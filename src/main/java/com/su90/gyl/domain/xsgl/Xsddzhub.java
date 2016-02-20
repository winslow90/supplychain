package com.su90.gyl.domain.xsgl;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Xsddzhub implements Serializable{
	private Long xsyddzhubid;//主键
	private String ddh;//订单号
	private Date dhrq;//订货日期
	private Date sxrq;//失效日期
	private String khmc;//客户名称
	private Float zdkl;//整单扣率
	private String sxbm;//销售部门
	private String ywy;//业务员
	private String kpdw;//开票单位
	private String shdq;//收货地区
	private String shdz;//收货地址
	private String spr;//审批人
	private Date sprq;//审批日期
	private String zdr;//制单人
	private Date zdrq;//制单日期
	private String xgr;//修改人
	private Date xgrq;//修改日期
	private String state;//状态
	private Boolean thbz;//退货标志
	private Boolean ckjsbz;//出库结束标志
	private Boolean kpjsbz;//开票结束标志
	private Boolean fhjsbz;//发货结束标志
	private Float zdsjhj;//整单税价合计
	private Float sxkje;//收现款金额
	
	private Set<Xsddzhib> xsddzhibs;

	public Long getXsyddzhubid() {
		return xsyddzhubid;
	}

	public void setXsyddzhubid(Long xsyddzhubid) {
		this.xsyddzhubid = xsyddzhubid;
	}

	public String getDdh() {
		return ddh;
	}

	public void setDdh(String ddh) {
		this.ddh = ddh;
	}

	public Date getDhrq() {
		return dhrq;
	}

	public void setDhrq(Date dhrq) {
		this.dhrq = dhrq;
	}

	public Date getSxrq() {
		return sxrq;
	}

	public void setSxrq(Date sxrq) {
		this.sxrq = sxrq;
	}

	public String getKhmc() {
		return khmc;
	}

	public void setKhmc(String khmc) {
		this.khmc = khmc;
	}

	public Float getZdkl() {
		return zdkl;
	}

	public void setZdkl(Float zdkl) {
		this.zdkl = zdkl;
	}

	public String getSxbm() {
		return sxbm;
	}

	public void setSxbm(String sxbm) {
		this.sxbm = sxbm;
	}

	public String getYwy() {
		return ywy;
	}

	public void setYwy(String ywy) {
		this.ywy = ywy;
	}

	public String getKpdw() {
		return kpdw;
	}

	public void setKpdw(String kpdw) {
		this.kpdw = kpdw;
	}

	public String getShdq() {
		return shdq;
	}

	public void setShdq(String shdq) {
		this.shdq = shdq;
	}

	public String getShdz() {
		return shdz;
	}

	public void setShdz(String shdz) {
		this.shdz = shdz;
	}

	public String getSpr() {
		return spr;
	}

	public void setSpr(String spr) {
		this.spr = spr;
	}

	public Date getSprq() {
		return sprq;
	}

	public void setSprq(Date sprq) {
		this.sprq = sprq;
	}

	public String getZdr() {
		return zdr;
	}

	public void setZdr(String zdr) {
		this.zdr = zdr;
	}

	public Date getZdrq() {
		return zdrq;
	}

	public void setZdrq(Date zdrq) {
		this.zdrq = zdrq;
	}

	public String getXgr() {
		return xgr;
	}

	public void setXgr(String xgr) {
		this.xgr = xgr;
	}

	public Date getXgrq() {
		return xgrq;
	}

	public void setXgrq(Date xgrq) {
		this.xgrq = xgrq;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Boolean getThbz() {
		return thbz;
	}

	public void setThbz(Boolean thbz) {
		this.thbz = thbz;
	}

	public Boolean getCkjsbz() {
		return ckjsbz;
	}

	public void setCkjsbz(Boolean ckjsbz) {
		this.ckjsbz = ckjsbz;
	}

	public Boolean getKpjsbz() {
		return kpjsbz;
	}

	public void setKpjsbz(Boolean kpjsbz) {
		this.kpjsbz = kpjsbz;
	}

	public Boolean getFhjsbz() {
		return fhjsbz;
	}

	public void setFhjsbz(Boolean fhjsbz) {
		this.fhjsbz = fhjsbz;
	}

	public Float getZdsjhj() {
		return zdsjhj;
	}

	public void setZdsjhj(Float zdsjhj) {
		this.zdsjhj = zdsjhj;
	}

	public Float getSxkje() {
		return sxkje;
	}

	public void setSxkje(Float sxkje) {
		this.sxkje = sxkje;
	}

	public Set<Xsddzhib> getXsddzhibs() {
		return xsddzhibs;
	}

	public void setXsddzhibs(Set<Xsddzhib> xsddzhibs) {
		this.xsddzhibs = xsddzhibs;
	}
}
