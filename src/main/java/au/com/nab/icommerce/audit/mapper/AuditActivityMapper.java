package au.com.nab.icommerce.audit.mapper;


import au.com.nab.icommerce.audit.domain.model.AuditActivity;
import au.com.nab.icommerce.base.dto.EntityMapper;
import au.com.nab.icommerce.base.dto.RequestHeaderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper for the entity Audit Activity and its DTO
 */
@Mapper(componentModel = "spring", uses = {})
public interface AuditActivityMapper extends EntityMapper<RequestHeaderDTO, AuditActivity> {

    @Mapping(source = "userid", target = "userid")
    @Mapping(source = "httpMethod", target = "httpMethod")
    @Mapping(source = "httpUrl", target = "httpUrl")
    @Mapping(source = "httpBody", target = "httpBody")
    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "updatedAt", target = "updatedAt")
    RequestHeaderDTO toDto(AuditActivity auditActivity);

    @Mapping(source = "userid", target = "userid")
    @Mapping(source = "httpMethod", target = "httpMethod")
    @Mapping(source = "httpUrl", target = "httpUrl")
    @Mapping(source = "httpBody", target = "httpBody")
    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "updatedAt", target = "updatedAt")
    AuditActivity toEntity(RequestHeaderDTO requestHeaderDTO);

}
