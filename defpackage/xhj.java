package defpackage;

import android.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhj {
    public final aidr a;
    public final asgk b;
    private final fctc c;

    public xhj(aidr aidrVar, asgk asgkVar) {
        aidrVar.getClass();
        asgkVar.getClass();
        this.a = aidrVar;
        this.b = asgkVar;
        this.c = fctd.a(new fdae() { // from class: xhi
            @Override // defpackage.fdae
            public final Object invoke() {
                xhj xhjVar = this.a;
                boolean z = false;
                if (!xhjVar.b.a() && xhjVar.a.a()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final dpxd a(int i) {
        return b() ? new dpxa(R.attr.colorBackground) : new dpxb(i);
    }

    public final boolean b() {
        return ((Boolean) this.c.a()).booleanValue();
    }
}
