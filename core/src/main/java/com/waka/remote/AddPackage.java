package com.waka.remote;

import com.waka.dto.PackageDTO;
import jakarta.ejb.Remote;

@Remote
public interface AddPackage {
     boolean addPackageData(PackageDTO packageDTO);
}
