package com.google.android.libraries.user.profile.photopicker.picker;

import android.os.Bundle;
import android.view.Menu;
import com.google.android.apps.messaging.R;
import defpackage.dsuy;
import defpackage.dsva;
import defpackage.dsvb;
import defpackage.dswb;
import defpackage.dtaa;
import defpackage.eddq;
import defpackage.edmz;
import defpackage.eduq;
import defpackage.edus;
import defpackage.eduu;
import defpackage.edux;
import defpackage.eduz;
import defpackage.ejwl;
import defpackage.ekrg;
import defpackage.eygj;
import defpackage.eygk;
import defpackage.fbgv;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PhotoPickerActivity extends edus implements eygk, edux {
    private static final ekrg w = ekrg.c("com/google/android/libraries/user/profile/photopicker/picker/PhotoPickerActivity");
    public eduq o;
    public fcsu p;
    public dswb q;
    public dsva r;
    public fcsu s;
    public edmz t;
    public dsvb u;
    public eygj v;

    @Override // defpackage.edux
    public final eduu E() {
        return (eduu) this.p.b();
    }

    @Override // defpackage.eygk
    public final eygj ab() {
        return this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    @Override // defpackage.eg, defpackage.abi, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.user.profile.photopicker.picker.PhotoPickerActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // defpackage.edus, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        eddq.a(this);
        eduz.a(this);
        super.onCreate(bundle);
        if (fbgv.a.get().E()) {
            ejwl.b(this.o.a(), "invalid intent params");
        } else if (!this.o.a()) {
            finish();
            return;
        }
        dsuy dsuyVarA = this.q.b.a(89757);
        dsuyVarA.g(this.u);
        dsuyVarA.g(dtaa.b());
        dsuyVarA.f(this.r);
        dsuyVarA.d(this);
        ((eduu) this.p.b()).n();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.photo_picker_common_menu, menu);
        return true;
    }
}
