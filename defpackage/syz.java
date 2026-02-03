package defpackage;

import android.content.Context;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syz implements ccyz {
    public static final eksp a = eksp.c("BugleAppOnAuto");
    public final Context b;
    private final fdjx c;

    public syz(Context context, fdjx fdjxVar) {
        context.getClass();
        fdjxVar.getClass();
        this.b = context;
        this.c = fdjxVar;
    }

    @Override // defpackage.ccyz
    public final void a() throws IOException {
        eieu eieuVarH = eiiy.h("MessagingTemplateScreenServiceEnabler#settingComponent");
        try {
            auvw.k(this.c, null, null, new syy(this, null), 3);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.ccyz
    public final boolean gd() {
        return true;
    }
}
