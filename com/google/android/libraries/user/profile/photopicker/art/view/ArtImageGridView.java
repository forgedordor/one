package com.google.android.libraries.user.profile.photopicker.art.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.view.ArtImageGridView;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.material.textview.MaterialTextView;
import defpackage.dsvh;
import defpackage.dsvx;
import defpackage.dswb;
import defpackage.ecyn;
import defpackage.eddg;
import defpackage.eddy;
import defpackage.edea;
import defpackage.edhp;
import defpackage.edmz;
import defpackage.ekgb;
import defpackage.eygk;
import defpackage.rbh;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ArtImageGridView extends eddg {
    public edmz a;
    public eddy b;
    public dswb c;
    public dsvx d;
    public dsvh e;
    public boolean f;
    public ecyn g;
    private final TableLayout i;
    private int j;

    public ArtImageGridView(Context context) {
        this(context, null);
    }

    private final TableRow.LayoutParams g(boolean z) {
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams();
        int dimension = (int) getResources().getDimension(R.dimen.photo_picker_grid_spacing);
        layoutParams.setMargins(0, 0, 0, 0);
        if (true == z) {
            dimension = 0;
        }
        layoutParams.setMarginEnd(dimension);
        layoutParams.width = 0;
        layoutParams.weight = 1.0f;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ekgb ekgbVar, int i) {
        ArrayList arrayList = new ArrayList();
        int size = ekgbVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            final edhp edhpVar = (edhp) ekgbVar.get(i2);
            final SquareImageView squareImageView = (SquareImageView) LayoutInflater.from(getContext()).inflate(R.layout.photo_picker_grid_item, (ViewGroup) this, false).findViewById(R.id.photo_picker_grid_image);
            this.b.h(Uri.parse(edhpVar.d()), new edea(), squareImageView, this.f ? rbh.HIGH : rbh.NORMAL);
            squareImageView.setContentDescription(edhpVar.b());
            this.d.b(squareImageView, this.c.a(i));
            squareImageView.setOnClickListener(new View.OnClickListener() { // from class: edcy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ArtImageGridView artImageGridView = this.a;
                    artImageGridView.e.a(dsvg.e(), squareImageView);
                    artImageGridView.a.c = 15;
                    edhp edhpVar2 = edhpVar;
                    artImageGridView.g.c(edhpVar2.a(), edhpVar2.c());
                }
            });
            squareImageView.setTag(R.id.op3_rounded_corner_image_id, Long.valueOf(edhpVar.a()));
            arrayList.add(squareImageView);
        }
        TableLayout tableLayout = this.i;
        if (tableLayout.getChildCount() > 0) {
            tableLayout.removeAllViews();
        }
        if (arrayList.iterator().hasNext()) {
            TableRow tableRow = new TableRow(tableLayout.getContext());
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                View view = (View) it.next();
                if (i3 > 0 && i3 % this.j == 0) {
                    tableLayout.addView(tableRow);
                    tableRow = new TableRow(tableLayout.getContext());
                }
                i3++;
                if (i3 % this.j != 0) {
                    z = false;
                }
                tableRow.addView(view, g(z));
            }
            tableLayout.addView(tableRow);
            while (tableRow.getChildCount() < this.j) {
                ImageView imageView = new ImageView(tableLayout.getContext());
                imageView.setVisibility(4);
                tableRow.addView(imageView, g(tableRow.getChildCount() == this.j + (-1)));
            }
        }
    }

    public final void b(int i, int i2) {
        MaterialTextView materialTextView = (MaterialTextView) findViewById(R.id.photo_picker_art_image_grid_title);
        materialTextView.setText(i);
        materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, 0, 0, 0);
    }

    public final void c() {
        this.j = 4;
    }

    public ArtImageGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        setOrientation(1);
        Object baseContext = context;
        if (!this.h) {
            while (!(baseContext instanceof eygk) && (baseContext instanceof ContextWrapper)) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            ((eygk) baseContext).ab().a(this);
        }
        this.j = 10;
        inflate(getContext(), R.layout.photo_picker_art_image_grid, this);
        this.i = (TableLayout) findViewById(R.id.photo_picker_art_image_grid_content);
    }
}
