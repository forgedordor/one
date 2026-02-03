package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqaf extends vo {
    public final Integer a;
    public final fdap d;
    private final fctc f = fctd.a(new fdae() { // from class: dqab
        @Override // defpackage.fdae
        public final Object invoke() {
            if (this.a.a == null) {
                return null;
            }
            return new eesj().d(r0.intValue());
        }
    });
    public List e = fcvo.a;

    public dqaf(Integer num, fdap fdapVar) {
        this.a = num;
        this.d = fdapVar;
    }

    @Override // defpackage.vo
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        Chip chip = new Chip(viewGroup.getContext());
        eesj eesjVar = (eesj) this.f.a();
        if (eesjVar != null) {
            chip.fx(eesjVar);
        }
        return new dqae(this, chip);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        dqae dqaeVar = (dqae) wvVar;
        dqaeVar.getClass();
        final dqac dqacVar = (dqac) this.e.get(i);
        dqacVar.getClass();
        Chip chip = dqaeVar.s;
        chip.setText(dqacVar.a);
        final dqaf dqafVar = dqaeVar.t;
        chip.setOnClickListener(new View.OnClickListener() { // from class: dqad
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = dqae.u;
                this.a.d.invoke(dqacVar);
            }
        });
    }
}
