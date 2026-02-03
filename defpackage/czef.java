package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czef extends vo {
    private final czec e;
    private final ehqu f;
    public int d = 2;
    public final List a = new ArrayList();

    public czef(Context context, czec czecVar) {
        this.f = ehqs.a(context.getApplicationContext()).b().q(rtj.e());
        this.e = czecVar;
    }

    @Override // defpackage.vo
    public final int a() {
        int i = this.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return 2;
        }
        if (i2 != 2) {
            return this.a.size() + 1;
        }
        return 1;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        int i2;
        int i3 = this.d;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 != 0) {
            i2 = 2;
            if (i4 == 2) {
                return 4;
            }
        } else {
            i2 = 3;
        }
        if (i == 0) {
            return 1;
        }
        return i2;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new czee(layoutInflaterFrom.inflate(R.layout.location_attachment_picker_nearby_list_header_m2, viewGroup, false));
        }
        if (i == 2) {
            return new czee(layoutInflaterFrom.inflate(R.layout.location_attachment_picker_nearby_list_item_m2, viewGroup, false));
        }
        if (i == 3) {
            return new czee(layoutInflaterFrom.inflate(R.layout.location_attachment_picker_progress_bar, viewGroup, false));
        }
        if (i != 4) {
            return null;
        }
        return new czee(layoutInflaterFrom.inflate(R.layout.location_attachment_picker_nearby_places_error_m2, viewGroup, false));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) throws Resources.NotFoundException {
        int i2;
        czee czeeVar = (czee) wvVar;
        if (dF(i) == 2 && i - 1 >= 0) {
            final bxeq bxeqVar = (bxeq) this.a.get(i2);
            final czec czecVar = this.e;
            ehqu ehquVar = this.f;
            czeeVar.s.setText(bxeqVar.b());
            czeeVar.t.setText(bxeqVar.a());
            TextView textView = czeeVar.u;
            View view = czeeVar.a;
            textView.setText(view.getContext().getString(R.string.location_attachment_picker_nearby_distance, 0));
            view.setOnClickListener(new View.OnClickListener() { // from class: czed
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i3 = czee.w;
                    czecVar.d(bxeqVar);
                }
            });
            czeeVar.v.setImageResource(R.drawable.location_attachment_picker_nearby_icon_default_m2);
            if (bxeqVar.d) {
                Bitmap bitmap = bxeqVar.c;
                if (bitmap != null) {
                    ehquVar.g(bitmap).q(rtj.b()).v(czeeVar.v);
                    return;
                }
                return;
            }
            bxeqVar.d = true;
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.location_attachment_picker_nearby_image_size);
            String strB = ejwk.b(bxeqVar.b.ae());
            afhs afhsVar = czecVar.c;
            synchronized (afhsVar.d) {
                afhsVar.j.add(new afhn(afhsVar, strB, dimensionPixelSize, dimensionPixelSize, i));
            }
        }
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return i;
    }
}
