package com.google.android.libraries.user.profile.photopicker.art.home.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.home.view.CategoriesSectionView;
import com.google.android.material.textview.MaterialTextView;
import defpackage.dsvh;
import defpackage.dsvx;
import defpackage.dswb;
import defpackage.ecyn;
import defpackage.edbe;
import defpackage.eddy;
import defpackage.edea;
import defpackage.edhr;
import defpackage.edht;
import defpackage.ekgb;
import defpackage.eygk;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class CategoriesSectionView extends edbe {
    public eddy a;
    public dswb b;
    public dsvx c;
    public dsvh d;
    public ecyn e;

    public CategoriesSectionView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ekgb ekgbVar) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.photo_picker_categories_container);
        linearLayout.removeAllViews();
        for (int i = 0; i < ekgbVar.size(); i++) {
            edhr edhrVar = (edhr) ekgbVar.get(i);
            ViewGroup viewGroup = null;
            View viewInflate = inflate(getContext(), R.layout.photo_picker_category_section, null);
            LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.photo_picker_collection_container);
            MaterialTextView materialTextView = (MaterialTextView) viewInflate.findViewById(R.id.photo_picker_category_name);
            materialTextView.setText(edhrVar.c());
            if (TextUtils.isEmpty(edhrVar.c())) {
                materialTextView.setVisibility(8);
            }
            int i2 = 0;
            while (i2 < edhrVar.b().size()) {
                final edht edhtVar = (edht) edhrVar.b().get(i2);
                final View viewInflate2 = inflate(getContext(), R.layout.photo_picker_collection_image, viewGroup);
                ImageView imageView = (ImageView) viewInflate2.findViewById(R.id.photo_picker_collection_image);
                MaterialTextView materialTextView2 = (MaterialTextView) viewInflate2.findViewById(R.id.photo_picker_collection_name);
                MaterialTextView materialTextView3 = (MaterialTextView) viewInflate2.findViewById(R.id.photo_picker_collection_num_images);
                eddy eddyVar = this.a;
                Uri uri = Uri.parse(edhtVar.d());
                edea edeaVar = new edea();
                edeaVar.a();
                edeaVar.e();
                eddyVar.f(uri, edeaVar, imageView);
                materialTextView2.setText(edhtVar.c());
                materialTextView3.setText(String.valueOf(edhtVar.b()));
                this.c.b(viewInflate2, this.b.a(124726));
                viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: edbc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CategoriesSectionView categoriesSectionView = this.a;
                        categoriesSectionView.d.a(dsvg.e(), viewInflate2);
                        edht edhtVar2 = edhtVar;
                        categoriesSectionView.e.a(edhtVar2.a(), edhtVar2.c());
                    }
                });
                linearLayout2.addView(viewInflate2);
                i2++;
                viewGroup = null;
            }
            if (i < ekgbVar.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, 0, (int) getResources().getDimension(R.dimen.photo_picker_art_category_bottom_margin));
                viewInflate.setLayoutParams(layoutParams);
            }
            linearLayout.addView(viewInflate);
        }
    }

    public CategoriesSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        Object baseContext = context;
        if (!this.f) {
            while (!(baseContext instanceof eygk) && (baseContext instanceof ContextWrapper)) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            ((eygk) baseContext).ab().a(this);
        }
        inflate(getContext(), R.layout.photo_picker_categories_section, this);
        this.c.b(this, this.b.a(124725));
    }
}
