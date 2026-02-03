package com.google.android.apps.messaging.ui.mediapicker.c2o.customization;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import defpackage.cywv;
import defpackage.cyxc;
import defpackage.cyxe;
import defpackage.emsl;
import defpackage.emsp;
import defpackage.im;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CategoryCustomizationActivity extends cyxe {
    public CustomizationModel K;
    private CustomizationRecyclerView L;
    private cyxc M;

    @Override // defpackage.cyvb
    protected final emsp M() {
        return emsp.UNKNOWN_COMPOSE_SCREEN_CATEGORY;
    }

    @Override // defpackage.cyvb
    protected final Class N() {
        return MediaContentItem.class;
    }

    @Override // defpackage.cyvb, defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.compose2o_customization_activity);
        setTitle(R.string.c2o_customization_activity_title);
        im imVarK = k();
        if (imVarK != null) {
            imVarK.setHomeAsUpIndicator(0);
        }
        this.L = (CustomizationRecyclerView) findViewById(R.id.customization_recycler_view);
        this.K = (CustomizationModel) getIntent().getParcelableExtra("customization_model");
        cyxc cyxcVar = new cyxc(this, this.K);
        this.M = cyxcVar;
        this.L.al(cyxcVar);
        cyxc cyxcVar2 = this.M;
        cyxcVar2.d.f(this.L);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ac(1);
        this.L.ao(linearLayoutManager);
        c().b(this, new cywv(this));
        af(emsl.LOADED);
    }
}
