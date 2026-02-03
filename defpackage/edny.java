package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edny extends edoe {
    public int a;
    private ejwi b;
    private ejwi c;

    public edny() {
        ejud ejudVar = ejud.a;
        this.b = ejudVar;
        this.c = ejudVar;
    }

    @Override // defpackage.edoe
    public final edof a() {
        int i = this.a;
        if (i != 0) {
            return new ednz(this.b, i, this.c);
        }
        throw new IllegalStateException("Missing required properties: state");
    }

    @Override // defpackage.edoe
    public final void b(eure eureVar) {
        this.c = ejwi.j(eureVar);
    }

    @Override // defpackage.edoe
    public final void c(Uri uri) {
        this.b = ejwi.j(uri);
    }
}
