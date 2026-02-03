package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyas extends ConstraintLayout implements dyyh {
    public final MaterialButton i;
    public final MaterialButton j;
    public final MaterialButton k;
    public final ImageView l;
    public final ImageView m;
    public final ArrayList n;
    public dywb o;
    public exbg p;
    public lcj q;
    public dyaq r;
    public dyqd s;
    public dyyb t;

    public dyas(Context context) throws Resources.NotFoundException {
        super(context, null);
        this.n = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.policy_footer, this);
        this.i = (MaterialButton) findViewById(R.id.og_privacy_policy_button);
        this.j = (MaterialButton) findViewById(R.id.og_tos_button);
        this.k = (MaterialButton) findViewById(R.id.og_custom_button);
        this.l = (ImageView) findViewById(R.id.og_separator1);
        this.m = (ImageView) findViewById(R.id.og_separator2);
        getResources().getDimensionPixelSize(R.dimen.og_footer_added_separator_margin);
    }

    public static void f(MaterialButton materialButton) {
        materialButton.setMaxLines(3);
        materialButton.setEllipsize(null);
    }

    @Override // defpackage.dyyh
    public final void b(dyyb dyybVar) {
        dyybVar.c(this.i, 90532);
        dyybVar.c(this.j, 90533);
        dyybVar.c(this.k, 90534);
    }

    public final View.OnClickListener g(final dxxj dxxjVar, final int i) {
        dyqs dyqsVar = new dyqs(new View.OnClickListener() { // from class: dyap
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dyas dyasVar = this.a;
                dywb dywbVar = dyasVar.o;
                Object objA = dyasVar.q.a();
                exbf exbfVar = (exbf) dyasVar.p.toBuilder();
                exbfVar.copyOnWrite();
                exbg exbgVar = (exbg) exbfVar.instance;
                exbgVar.c = i - 1;
                exbgVar.b |= 1;
                dywbVar.a(objA, (exbg) exbfVar.build());
                dyasVar.t.f(new dsve(5), view);
                dxxjVar.a(view, dyasVar.q.a());
            }
        });
        dyqsVar.d = this.s.b();
        dyqsVar.e = this.s.a();
        return new dyqq(dyqsVar);
    }

    @Override // defpackage.dyyh
    public final void gW(dyyb dyybVar) {
        dyybVar.e(this.i);
        dyybVar.e(this.j);
        dyybVar.e(this.k);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.r != null) {
                while (true) {
                    ArrayList arrayList = this.n;
                    if (arrayList.isEmpty()) {
                        break;
                    }
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
                    if (getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                        break;
                    }
                    dyaq dyaqVar = (dyaq) arrayList.remove(0);
                    this.r = dyaqVar;
                    dyaqVar.a(this);
                }
                dyaq dyaqVar2 = this.r;
                if (dyaqVar2 != null) {
                    dyaqVar2.a(this);
                }
            }
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            dyaq dyaqVar3 = this.r;
            if (dyaqVar3 != null) {
                dyaqVar3.a(this);
            }
            super.onMeasure(i, i2);
            throw th;
        }
    }
}
