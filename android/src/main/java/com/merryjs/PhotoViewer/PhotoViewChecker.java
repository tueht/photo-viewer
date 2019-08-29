package com.merryjs.PhotoViewer;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import javax.annotation.Nonnull;

public class PhotoViewChecker extends ReactContextBaseJavaModule {

    public PhotoViewChecker(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Nonnull
    @Override
    public String getName() {
        return "PhotoViewChecker";
    }

    @ReactMethod
    public void isAvailable(final Promise promise) {
        try {
            promise.resolve(Fresco.hasBeenInitialized());
        } catch (Exception e) {
            promise.resolve(false);
        }
    }
}
