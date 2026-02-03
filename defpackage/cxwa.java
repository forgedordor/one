package defpackage;

import android.view.View;
import android.widget.AdapterView;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxwa implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ cpyb a;
    final /* synthetic */ cxwj b;

    public cxwa(cxwj cxwjVar, cpyb cpybVar) {
        this.a = cpybVar;
        this.b = cxwjVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, final int i, long j) {
        final cpyb cpybVar = this.a;
        eijx.f(new Runnable() { // from class: cxvz
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                final boolean z = false;
                if (i2 != 1 && i2 == 2) {
                    z = true;
                }
                cpyb cpybVar2 = cpybVar;
                cxwa cxwaVar = this.a;
                if (cpybVar2.equals(cpyb.MULTI_DEVICE)) {
                    cxwaVar.b.c.z(new Function() { // from class: aunj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            aumg aumgVar = (aumg) obj;
                            cqce cqceVar = aurx.a;
                            aumgVar.copyOnWrite();
                            aumq aumqVar = (aumq) aumgVar.instance;
                            aumq aumqVar2 = aumq.a;
                            aumqVar.b |= 2;
                            aumqVar.e = z;
                            return aumgVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                } else if (cpybVar2.equals(cpyb.BACKUP_AND_RESTORE)) {
                    cxwaVar.b.c.X(z);
                }
            }
        }, this.b.d);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
