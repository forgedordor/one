package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dyga extends dyfr {
    public final int y;
    public ImageView z;

    public dyga(ViewGroup viewGroup, Context context, dyyb dyybVar) {
        super(viewGroup, context, dyybVar);
        this.y = dypw.b(context, R.attr.ogIconColor);
    }

    protected abstract void D(ViewGroup viewGroup);

    @Override // defpackage.dyfr
    protected final void E(lvj lvjVar) {
        super.E(lvjVar);
        dyfk dyfkVar = this.x;
        dyfkVar.getClass();
        ((dyfy) dyfkVar).j.l(lvjVar);
    }

    @Override // defpackage.dyfr
    protected final void F(ViewGroup viewGroup, ViewGroup viewGroup2) {
        View viewInflate = LayoutInflater.from(this.s).inflate(R.layout.og_icon_dynamic_card, viewGroup);
        this.z = (ImageView) viewInflate.findViewById(R.id.og_card_icon);
        D((ViewGroup) viewInflate.findViewById(R.id.og_card_view_container));
    }

    protected final void G(lvj lvjVar, dyfy dyfyVar) {
        super.H(lvjVar, dyfyVar);
        dyfyVar.j.f(lvjVar, new lvz() { // from class: dyfz
            @Override // defpackage.lvz
            public final void a(Object obj) {
                dyga dygaVar = this.a;
                dygaVar.z.setImageDrawable(((dyhk) obj).e(dygaVar.s, dygaVar.y));
            }
        });
    }
}
