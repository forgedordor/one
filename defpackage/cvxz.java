package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvxz implements cvxp {
    private final Context a;
    private final boolean b;
    private final boolean c;
    private final elwp d;
    private final ekgp e;
    private final aoer f;
    private final boolean g;
    private final ekgb h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;

    public cvxz(Context context, boolean z, boolean z2, elwp elwpVar, ekgp ekgpVar, aoer aoerVar, boolean z3, ekgb ekgbVar) throws Resources.NotFoundException {
        this.a = context;
        this.b = z;
        this.c = z2;
        this.d = elwpVar;
        this.e = ekgpVar;
        this.f = aoerVar;
        this.g = z3;
        this.h = ekgbVar;
        String string = context.getString(R.string.more_about_rcs_chats);
        string.getClass();
        this.i = string;
        String string2 = context.getString(R.string.encryption_status_details_off, string);
        string2.getClass();
        this.j = string2;
        String string3 = context.getString(R.string.encryption_status_details_send_only_xms, string);
        string3.getClass();
        this.k = string3;
        String string4 = context.getString(R.string.encryption_status_details_off, string);
        string4.getClass();
        this.l = string4;
        String string5 = context.getResources().getString(R.string.encryption_status_details_on_default_v3, string);
        string5.getClass();
        this.m = string5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    @Override // defpackage.cvxp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cvxw a() {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvxz.a():cvxw");
    }
}
