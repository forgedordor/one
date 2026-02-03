package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxf extends ejxi {
    final /* synthetic */ ejvg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejxf(ejxk ejxkVar, CharSequence charSequence, ejvg ejvgVar) {
        super(ejxkVar, charSequence);
        this.b = ejvgVar;
    }

    @Override // defpackage.ejxi
    public final int b(int i) {
        return ((ejvw) this.b).a.end();
    }

    @Override // defpackage.ejxi
    public final int c(int i) {
        Matcher matcher = ((ejvw) this.b).a;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }
}
