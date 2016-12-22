LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE    := OSNet
LOCAL_SRC_FILES := OSNetworkSystem.cpp
include $(BUILD_SHARED_LIBRARY)