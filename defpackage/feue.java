package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feue extends feou {
    private static final long serialVersionUID = 8430929418723298803L;
    private URI c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feue() {
        super("ATTENDEE");
        fera feraVar = fera.a;
    }

    @Override // defpackage.fenc
    public final String a() {
        String strF = fexb.f(this.c);
        int i = fexd.a;
        return strF;
    }

    @Override // defpackage.feou
    public final void c(String str) {
        this.c = fexd.b(str);
    }
}
