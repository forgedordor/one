package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.IRevocationService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.dbrd;
import defpackage.dbri;
import defpackage.dbrm;
import defpackage.dbro;
import defpackage.dbrq;
import defpackage.dbrs;
import defpackage.dbrw;
import defpackage.dcfq;
import defpackage.dcfs;
import defpackage.dcft;
import defpackage.dcfx;
import defpackage.dciw;
import defpackage.dclg;
import defpackage.dclh;
import defpackage.dcnn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RevocationService extends IRevocationService.Stub {
    private final Context a;

    public RevocationService(Context context) {
        this.a = context;
    }

    private final void a() {
        if (dcnn.a(this.a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.IRevocationService
    public void cleanupClientState() {
        a();
        dbrs.a(this.a).b();
    }

    @Override // com.google.android.gms.auth.api.signin.internal.IRevocationService
    public void revokeAccess() {
        BasePendingResult basePendingResult;
        dcfs dcfsVar;
        a();
        Context context = this.a;
        dbrw dbrwVarC = dbrw.c(context);
        GoogleSignInAccount googleSignInAccountA = dbrwVarC.a();
        GoogleSignInOptions googleSignInOptionsB = GoogleSignInOptions.e;
        if (googleSignInAccountA != null) {
            googleSignInOptionsB = dbrwVarC.b();
        }
        dclh.m(googleSignInOptionsB);
        dbrd dbrdVar = new dbrd(context, googleSignInOptionsB);
        if (googleSignInAccountA == null) {
            dcfq dcfqVar = dbrdVar.k;
            Context context2 = dbrdVar.c;
            int iA = dbrdVar.a();
            dbrq.a.b("Signing out", new Object[0]);
            dbrq.a(context2);
            if (iA == 3) {
                dcfx dcfxVar = Status.a;
                BasePendingResult dciwVar = new dciw(dcfqVar);
                dciwVar.m(dcfxVar);
                basePendingResult = dciwVar;
            } else {
                dbrm dbrmVar = new dbrm(dcfqVar);
                dcfqVar.c(dbrmVar);
                basePendingResult = dbrmVar;
            }
            dclg.b(basePendingResult);
            return;
        }
        dcfq dcfqVar2 = dbrdVar.k;
        Context context3 = dbrdVar.c;
        int iA2 = dbrdVar.a();
        dbrq.a.b("Revoking access", new Object[0]);
        String strD = dbrw.c(context3).d("refreshToken");
        dbrq.a(context3);
        if (iA2 == 3) {
            int i = dbri.b;
            if (strD == null) {
                Status status = new Status(4);
                dclh.b(!status.d(), "Status code must not be SUCCESS");
                dcft dcftVar = new dcft(status);
                dcftVar.m(status);
                dcfsVar = dcftVar;
            } else {
                dbri dbriVar = new dbri(strD);
                new Thread(dbriVar).start();
                dcfsVar = dbriVar.a;
            }
        } else {
            dbro dbroVar = new dbro(dcfqVar2);
            dcfqVar2.c(dbroVar);
            dcfsVar = dbroVar;
        }
        dclg.b(dcfsVar);
    }
}
