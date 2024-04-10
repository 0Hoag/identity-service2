package com.example.identityservice.mapper;

import com.example.identityservice.dto.request.PermissionRequest;
import com.example.identityservice.dto.request.UserCreationRequest;
import com.example.identityservice.dto.request.UserUpdateRequest;
import com.example.identityservice.dto.request.response.PermissionResponse;
import com.example.identityservice.dto.request.response.UserResponse;
import com.example.identityservice.entity.Permission;
import com.example.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);

}
