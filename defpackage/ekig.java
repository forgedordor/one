package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekig extends ekgo {
    private static final long serialVersionUID = 0;
    private final Comparator a;

    public ekig(ekih ekihVar) {
        super(ekihVar);
        this.a = ekihVar.comparator();
    }

    @Override // defpackage.ekgo
    public final /* bridge */ /* synthetic */ ekgi a(int i) {
        return new ekif(this.a);
    }
}
