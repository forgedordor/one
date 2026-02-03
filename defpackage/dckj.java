package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dckj extends dckk {
    final /* synthetic */ Intent a;
    final /* synthetic */ dchu b;

    public dckj(Intent intent, dchu dchuVar) {
        this.a = intent;
        this.b = dchuVar;
    }

    @Override // defpackage.dckk
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
