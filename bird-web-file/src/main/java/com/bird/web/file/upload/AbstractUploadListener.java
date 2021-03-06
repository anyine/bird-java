package com.bird.web.file.upload;

import com.bird.web.file.upload.validator.ValidateResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author liuxx
 * @date 2018/5/2
 */
public class AbstractUploadListener implements IUploadListener {
    @Override
    public void beforeValidate(MultipartFile file, IUploadContext context) {

    }

    @Override
    public void afterValidate(MultipartFile file, IUploadContext context, ValidateResult result) {

    }

    @Override
    public void beforeHandle(MultipartFile file, IUploadContext context) {

    }

    @Override
    public void afterHandle(MultipartFile file, IUploadContext context) {

    }

    @Override
    public void beforeStorage(MultipartFile file, IUploadContext context) {

    }

    @Override
    public void afterStorage(MultipartFile file, IUploadContext context, UploadResult result) {

    }
}
