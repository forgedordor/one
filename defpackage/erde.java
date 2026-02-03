package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erde {
    public eqsp f;
    public Context a = null;
    public String b = null;
    public String c = null;
    private String g = null;
    private eqrz h = null;
    public eqsj d = null;
    public ermh e = null;

    private final eqrz d() throws KeyStoreException {
        boolean z;
        Object obj = erdf.a;
        erdj erdjVar = new erdj();
        try {
            String str = this.g;
            synchronized (erdj.a) {
                String strE = erwk.e(str);
                if (erdh.a().containsAlias(strE)) {
                    z = false;
                } else {
                    KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strE, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpecBuild);
                    keyGenerator.generateKey();
                    z = true;
                }
            }
            try {
                return erdjVar.a(this.g);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!z) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.g), e);
                }
                Log.w(erdf.b, "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            Log.w(erdf.b, "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    private final eqsp e(byte[] bArr) throws GeneralSecurityException, IOException {
        try {
            this.h = new erdj().a(this.g);
            try {
                byte[] bArr2 = new byte[0];
                eqsa eqsaVarA = eqsa.a(bArr);
                eqrz eqrzVar = this.h;
                try {
                    InputStream inputStream = eqsaVarA.a;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erlj erljVar = (erlj) evsn.parseFrom(erlj.a, inputStream, evrr.a);
                    if (erljVar == null || erljVar.c.d() == 0) {
                        throw new GeneralSecurityException("empty keyset");
                    }
                    try {
                        erml ermlVar = (erml) evsn.parseFrom(erml.a, eqrzVar.a(erljVar.c.I(), bArr2), evrr.a);
                        eqso.i(ermlVar);
                        return eqsp.b(eqso.d(ermlVar));
                    } catch (evtj unused) {
                        throw new GeneralSecurityException("invalid keyset, corrupted key material");
                    }
                } finally {
                    eqsaVarA.a.close();
                }
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return f(bArr);
                } catch (IOException unused2) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                eqsp eqspVarF = f(bArr);
                Log.w(erdf.b, "cannot use Android Keystore, it'll be disabled", e2);
                return eqspVarF;
            } catch (IOException unused3) {
                throw e2;
            }
        }
    }

    private static final eqsp f(byte[] bArr) {
        return eqsp.b(eqsb.a(eqsa.a(bArr)));
    }

    public final synchronized erdf a() {
        erdf erdfVar;
        if (this.b == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        ermh ermhVar = this.e;
        if (ermhVar != null && this.d == null) {
            this.d = new eqsj(eqta.a(ermhVar.toByteArray()));
        }
        synchronized (erdf.a) {
            Context context = this.a;
            String str = this.b;
            String str2 = this.c;
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            byte[] bArrB = null;
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string != null) {
                    bArrB = ervq.b(string);
                }
                if (bArrB == null) {
                    if (this.g != null) {
                        this.h = d();
                    }
                    eqsj eqsjVar = this.d;
                    if (eqsjVar == null) {
                        throw new GeneralSecurityException("cannot read or generate keyset");
                    }
                    eqst eqstVarA = eqsjVar.a;
                    if (eqstVarA == null) {
                        eqstVarA = eqta.a(eqsjVar.a().toByteArray());
                    }
                    eqsm eqsmVar = new eqsm();
                    eqsk eqskVar = new eqsk(eqstVarA);
                    eqskVar.e = eqsl.a;
                    eqskVar.a();
                    eqsmVar.c(eqskVar);
                    eqso eqsoVarA = eqsmVar.a();
                    Context context2 = this.a;
                    String str3 = this.b;
                    String str4 = this.c;
                    if (str3 == null) {
                        throw new IllegalArgumentException("keysetName cannot be null");
                    }
                    Context applicationContext2 = context2.getApplicationContext();
                    SharedPreferences.Editor editorEdit = str4 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext2).edit() : applicationContext2.getSharedPreferences(str4, 0).edit();
                    eqrz eqrzVar = this.h;
                    try {
                        if (eqrzVar != null) {
                            erml ermlVar = eqsoVarA.a;
                            byte[] bArrB2 = eqrzVar.b(ermlVar.toByteArray(), new byte[0]);
                            erli erliVar = (erli) erlj.a.createBuilder();
                            evqs evqsVarX = evqs.x(bArrB2);
                            erliVar.copyOnWrite();
                            ((erlj) erliVar.instance).c = evqsVarX;
                            ermp ermpVarA = eqtb.a(ermlVar);
                            erliVar.copyOnWrite();
                            erlj erljVar = (erlj) erliVar.instance;
                            ermpVarA.getClass();
                            erljVar.d = ermpVarA;
                            erljVar.b = 1 | erljVar.b;
                            if (!editorEdit.putString(str3, ervq.a(((erlj) erliVar.build()).toByteArray())).commit()) {
                                throw new IOException("Failed to write to SharedPreferences");
                            }
                        } else if (!editorEdit.putString(str3, ervq.a(eqsoVarA.a.toByteArray())).commit()) {
                            throw new IOException("Failed to write to SharedPreferences");
                        }
                        this.f = eqsp.b(eqsoVarA);
                    } catch (IOException e) {
                        throw new GeneralSecurityException(e);
                    }
                } else if (this.g != null) {
                    this.f = e(bArrB);
                } else {
                    this.f = f(bArrB);
                }
                erdfVar = new erdf(this);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }
        return erdfVar;
    }

    public final void b(String str) {
        if (!str.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        this.g = str;
    }

    public final void c(Context context, String str, String str2) {
        if (context == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        this.a = context;
        this.b = str;
        this.c = str2;
    }
}
