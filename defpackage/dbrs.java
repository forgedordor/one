package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbrs {
    private static dbrs b;
    final dbrw a;

    private dbrs(Context context) {
        dbrw dbrwVarC = dbrw.c(context);
        this.a = dbrwVarC;
        dbrwVarC.a();
        dbrwVarC.b();
    }

    public static synchronized dbrs a(Context context) {
        return d(context.getApplicationContext());
    }

    private static synchronized dbrs d(Context context) {
        dbrs dbrsVar = b;
        if (dbrsVar != null) {
            return dbrsVar;
        }
        dbrs dbrsVar2 = new dbrs(context);
        b = dbrsVar2;
        return dbrsVar2;
    }

    public final synchronized void b() {
        dbrw dbrwVar = this.a;
        dbrwVar.a.lock();
        try {
            dbrwVar.b.edit().clear().apply();
        } finally {
            dbrwVar.a.unlock();
        }
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        dclh.m(googleSignInOptions);
        dbrw dbrwVar = this.a;
        String str = googleSignInAccount.h;
        dbrwVar.f("defaultGoogleSignInAccount", str);
        dclh.m(googleSignInOptions);
        String strE = dbrwVar.e("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.a;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.b;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.c;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.d;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.j;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.k;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.e;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.g);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.i;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: dbrb
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Scope) obj).b.compareTo(((Scope) obj2).b);
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            dbrwVar.f(strE, jSONObject.toString());
            String strE2 = dbrwVar.e("googleSignInOptions", str);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = googleSignInOptions.h;
                Collections.sort(arrayList, GoogleSignInOptions.f);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.i;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.j);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.l);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.k);
                String str9 = googleSignInOptions.m;
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("serverClientId", str9);
                }
                String str10 = googleSignInOptions.n;
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("hostedDomain", str10);
                }
                dbrwVar.f(strE2, jSONObject2.toString());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}
