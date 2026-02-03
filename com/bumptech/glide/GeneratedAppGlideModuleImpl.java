package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.google.apps.tiktok.media.TikTokAppGlideModule;
import defpackage.rat;
import defpackage.raw;
import defpackage.rbb;
import defpackage.rbn;
import defpackage.rsd;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final TikTokAppGlideModule a = new TikTokAppGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.google.apps.tiktok.media.TikTokAppGlideModule");
        }
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final /* synthetic */ rsd a() {
        return new rat();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final Set b() {
        return Collections.EMPTY_SET;
    }

    @Override // defpackage.rso
    public final void c(Context context, rbb rbbVar) {
        this.a.c(context, rbbVar);
    }

    @Override // defpackage.rsp
    public final void d(Context context, raw rawVar, rbn rbnVar) {
        this.a.d(context, rawVar, rbnVar);
    }
}
