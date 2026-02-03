package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdl extends qbk {
    private static final String h = qas.d("WorkContinuationImpl");
    public final qee a;
    public final String b;
    public final pzz c;
    public final List d;
    public final List e;
    public final List f;
    public boolean g;
    private qba i;

    public qdl(qee qeeVar, String str, pzz pzzVar, List list) {
        this(qeeVar, str, pzzVar, list, null);
    }

    @Override // defpackage.qbk
    public final qba a() {
        if (this.g) {
            qas.c();
            Log.w(h, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            qee qeeVar = this.a;
            this.i = qbe.a(qeeVar.d.m, "EnqueueRunnable_".concat(String.valueOf(this.c.name())), qeeVar.m.a, new fdae() { // from class: qdk
                @Override // defpackage.fdae
                public final Object invoke() {
                    qkz.a(this.a);
                    return fctx.a;
                }
            });
        }
        return this.i;
    }

    public qdl(qee qeeVar, String str, pzz pzzVar, List list, byte[] bArr) {
        this.a = qeeVar;
        this.b = str;
        this.c = pzzVar;
        this.d = list;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (pzzVar == pzz.a && ((qbu) list.get(i)).b.w != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strA = ((qbu) list.get(i)).a();
            this.e.add(strA);
            this.f.add(strA);
        }
    }
}
