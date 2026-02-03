package com.google.android.libraries.user.profile.photopicker.art.home.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.dsvh;
import defpackage.dsvx;
import defpackage.dswb;
import defpackage.ecyn;
import defpackage.edbf;
import defpackage.edda;
import defpackage.eddc;
import defpackage.eddh;
import defpackage.eddi;
import defpackage.eddy;
import defpackage.edmz;
import defpackage.eygk;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class RandomArtImagesSectionView extends edbf {
    public eddi b;
    public dswb c;
    public dsvx d;
    public final eddh e;
    public ecyn f;
    private final RecyclerView g;

    public RandomArtImagesSectionView(Context context) {
        this(context, null);
    }

    public RandomArtImagesSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        Object baseContext = context;
        if (!this.a) {
            while (!(baseContext instanceof eygk) && (baseContext instanceof ContextWrapper)) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            ((eygk) baseContext).ab().a(this);
        }
        inflate(getContext(), R.layout.photo_picker_random_art_section, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.photo_picker_recycler_grid);
        this.g = recyclerView;
        this.d.b(this, this.c.a(124721));
        recyclerView.getContext();
        recyclerView.ao(new GridLayoutManager(3, 0));
        eddi eddiVar = this.b;
        eddc eddcVar = new eddc() { // from class: edbh
            @Override // defpackage.eddc
            public final void a(long j, String str) {
                this.a.f.c(j, str);
            }
        };
        eddy eddyVar = (eddy) eddiVar.a.b();
        eddyVar.getClass();
        dswb dswbVar = (dswb) eddiVar.b.b();
        dswbVar.getClass();
        dsvx dsvxVar = (dsvx) eddiVar.c.b();
        dsvxVar.getClass();
        dsvh dsvhVar = (dsvh) eddiVar.d.b();
        dsvhVar.getClass();
        edmz edmzVar = (edmz) eddiVar.e.b();
        edmzVar.getClass();
        eddh eddhVar = new eddh(eddyVar, dswbVar, dsvxVar, dsvhVar, edmzVar, eddcVar);
        this.e = eddhVar;
        recyclerView.al(eddhVar);
        recyclerView.v(new edda((int) getResources().getDimension(R.dimen.photo_picker_grid_spacing), getResources().getInteger(R.integer.photo_picker_random_art_num_rows), 0, false));
    }
}
