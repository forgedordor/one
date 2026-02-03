package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.View;
import android.widget.TableLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edpv extends edpx {
    public eduu a;
    public eddy b;
    public dswb c;
    public dsvh d;
    public edmz e;
    public edqd f;
    public MaterialTextView g;
    public edrb h;

    public edpv(Context context) {
        super(context);
        setOrientation(1);
        if (!this.i) {
            Object context2 = getContext();
            while (!(context2 instanceof eygk) && (context2 instanceof ContextWrapper)) {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            ((eygk) context2).ab().a(this);
        }
        inflate(getContext(), true != fbgv.i() ? R.layout.photo_picker_google_photos_section : R.layout.photo_picker_google_photos_section_art_style, this);
        this.g = (MaterialTextView) findViewById(R.id.photo_picker_suggested_section_title);
        this.f = new edqd((TableLayout) findViewById(R.id.photo_picker_suggested_photos_grid), getContext().getResources().getInteger(R.integer.photo_picker_num_columns));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List a(ekgb ekgbVar) {
        ArrayList arrayList = new ArrayList();
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            etwu etwuVar = (etwu) ekgbVar.get(i);
            if ((etwuVar.b & 1) != 0) {
                final SquareImageView squareImageViewA = fbgv.i() ? SquareImageView.a(getContext()) : new SquareImageView(getContext());
                if ((etwuVar.b & 8) != 0) {
                    Context context = getContext();
                    evvp evvpVar = etwuVar.f;
                    if (evvpVar == null) {
                        evvpVar = evvp.a;
                    }
                    squareImageViewA.setContentDescription(context.getString(R.string.op3_picker_accessibility_photo, eddj.a(evvpVar)));
                }
                final Uri uriA = eddx.a(etwuVar);
                eddy eddyVar = this.b;
                edea edeaVar = new edea();
                edeaVar.a();
                eddyVar.g(uriA, edeaVar, squareImageViewA);
                this.c.b.a(89756).b(squareImageViewA);
                squareImageViewA.setOnClickListener(new View.OnClickListener() { // from class: edpu
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        edpv edpvVar = this.a;
                        edpvVar.d.a(dsvg.e(), squareImageViewA);
                        edpvVar.e.c = 9;
                        edpvVar.a.m(uriA);
                    }
                });
                arrayList.add(squareImageViewA);
            }
        }
        return arrayList;
    }

    public final void b(int i) {
        this.c.b.a(i).b(this);
    }

    public final void c(int i) {
        this.g.setText(getContext().getString(i));
    }
}
