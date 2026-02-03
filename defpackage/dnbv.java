package defpackage;

import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbv extends vo {
    public final fdae a;
    public fdap d;
    private final dmys e;
    private final fdap f;

    public dnbv(dmys dmysVar, fdae fdaeVar, fdap fdapVar) {
        this.e = dmysVar;
        this.a = fdaeVar;
        this.f = fdapVar;
    }

    @Override // defpackage.vo
    public final int a() {
        return 1;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return 3;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.folders_button, viewGroup, false);
        viewInflate.getClass();
        return new dnbu(this, viewInflate);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        dnbu dnbuVar = (dnbu) wvVar;
        dnbuVar.getClass();
        Size sizeA = this.e.a(3);
        final dnbv dnbvVar = dnbuVar.t;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: dnbt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = dnbu.u;
                this.a.a.invoke();
            }
        };
        MaterialButton materialButton = dnbuVar.s;
        materialButton.setOnClickListener(onClickListener);
        ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = sizeA != null ? sizeA.getWidth() : -1;
        layoutParams.height = sizeA != null ? sizeA.getHeight() : -2;
        materialButton.setLayoutParams(layoutParams);
        int i2 = (sizeA != null ? sizeA.getWidth() : 0) > (sizeA != null ? sizeA.getHeight() : 0) ? 2 : 32;
        if (materialButton.f != i2) {
            materialButton.f = i2;
            materialButton.l(materialButton.getMeasuredWidth(), materialButton.getMeasuredHeight());
        }
        fdap fdapVar = dnbvVar.d;
        if (fdapVar != null) {
            fdapVar.invoke(materialButton);
        }
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void i(wv wvVar) {
        this.f.invoke(true);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void j(wv wvVar) {
        this.f.invoke(false);
    }
}
