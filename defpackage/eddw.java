package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eddw implements drgb {
    public final edgb a;
    public final SparseArray b = new SparseArray();
    public drga c;

    public eddw(Context context, edgb edgbVar) {
        this.a = edgbVar;
        AccountManager.get(context).addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: eddv
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                if (Log.isLoggable("FifeHeaderProvider", 3)) {
                    Log.d("FifeHeaderProvider", "Invalidate all cached tokens");
                }
                this.a.b.clear();
            }
        }, null, false);
    }

    @Override // defpackage.drgb
    public final synchronized rld a(drfl drflVar) {
        final int iA = drflVar.a();
        if (iA == -1) {
            return rld.a;
        }
        rlf rlfVar = new rlf();
        rle rleVar = new rle() { // from class: eddu
            @Override // defpackage.rle
            public final String a() {
                eddw eddwVar = this.a;
                SparseArray sparseArray = eddwVar.b;
                int i = iA;
                String strD = (String) sparseArray.get(i);
                if (strD == null) {
                    try {
                        edgb edgbVar = eddwVar.a;
                        Context context = edgbVar.a;
                        strD = dbmq.d(context, fbgv.a.get().o() ? dbmq.j(context)[i] : AccountManager.get(context).getAccountsByType("com.google")[i], edgbVar.b);
                        sparseArray.put(i, strD);
                    } catch (RemoteException | dbmi | dcen | dceo | IOException unused) {
                        strD = "";
                    }
                }
                return "Bearer ".concat(String.valueOf(strD));
            }
        };
        boolean z = rlfVar.a;
        rlfVar.b();
        rlfVar.c().add(rleVar);
        return rlfVar.a();
    }

    @Override // defpackage.drgb
    public final synchronized void b(drfl drflVar) {
        String str = (String) this.b.get(drflVar.a());
        if (str != null) {
            try {
                this.a.a(str);
            } catch (dbmi | IOException unused) {
            }
        }
        this.b.remove(drflVar.a());
        drga drgaVar = this.c;
        if (drgaVar != null) {
            ((drft) drgaVar).b.a.e();
        }
    }
}
