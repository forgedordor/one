package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecml extends ecmo {
    final /* synthetic */ Object[] a;
    final /* synthetic */ String b;
    final /* synthetic */ ecmp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecml(ecmp ecmpVar, Object[] objArr, String str) {
        super(ecmpVar);
        this.a = objArr;
        this.b = str;
        this.c = ecmpVar;
    }

    @Override // defpackage.ecni
    public final Cursor a(CancellationSignal cancellationSignal) {
        ecmp ecmpVar = this.c;
        ecmpVar.d.b();
        try {
            return ecmpVar.a.rawQueryWithFactory(new ecnx(this.a), this.b, null, null, cancellationSignal);
        } finally {
            this.c.d.a();
        }
    }

    @Override // defpackage.ecni
    public final String b() {
        return this.b;
    }
}
