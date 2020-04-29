package org.whystudio.internship.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 校内导师信息
 * </p>
 *
 * @author mrruan
 * @since 2020-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "Teacher对象", description = "校内导师信息")
public class Teacher extends Model<Teacher> implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "教职工号")
    @TableField("teachno") // 练练手
    private String teachno;

    @ApiModelProperty(value = "密码")
    @JsonIgnore
    private String password;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "身份证号码")
    private String idcard;

    @ApiModelProperty(value = "学院")
    private String college;

    @ApiModelProperty(value = "学院代码")
    private String collegecode;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime created;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modified;

    @ApiModelProperty(value = "状态1启用 0停用")
    private Boolean status;

    // 非数据库字段 备注
    //private transient String remark;
    //private static String remark;   // static 不参与序列化
    //@TableField(exist = false)   // 表示数据库中不存在此字段  这个就不会参与持久化
    //private String remark;
}
