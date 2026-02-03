package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.security.GeneralSecurityException;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgix implements dgiv {
    private final Context a;
    private final dgqw b;
    private final crny c;

    public dgix(Context context, dgqw dgqwVar, crny crnyVar) {
        this.a = context;
        this.b = dgqwVar;
        this.c = crnyVar;
    }

    private static final boolean e() {
        return ((Integer) dhhb.h.d()).equals(1);
    }

    @Override // defpackage.dgiv
    public final dgiq a(InputStream inputStream) throws XmlPullParserException, dgqu, IOException, NumberFormatException {
        Configuration configuration = new Configuration();
        this.b.a(inputStream, configuration, false);
        return configuration;
    }

    public final Configuration.Token b() {
        cqca.c("RcsProvisioning", "Retrieving backup token");
        dhgy dhgyVarD = d();
        for (int i = 0; !dhgyVarD.f && i < 20; i++) {
            synchronized (this) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = 100 + jCurrentTimeMillis;
                while (jCurrentTimeMillis < j) {
                    try {
                        wait(j - jCurrentTimeMillis);
                        jCurrentTimeMillis = System.currentTimeMillis();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (!dhgyVarD.f) {
            cqca.n("RcsProvisioning", "Unable to retrieve backup token!");
            return Configuration.a;
        }
        String strC = dhgyVarD.c("token_value", "");
        long jA = dhgyVarD.a("token_expiration", 0L);
        if (TextUtils.isEmpty(strC)) {
            cqca.c("RcsProvisioning", "No backup token found");
            return Configuration.a;
        }
        cqca.c("RcsProvisioning", "Backup token found");
        return new Configuration.Token(strC, TimeUnit.MILLISECONDS.toSeconds(jA - System.currentTimeMillis()));
    }

    public final dgiq c() throws dhkf, IOException {
        String deviceId;
        dgiq dgiqVar = null;
        try {
            Context context = this.a;
            boolean zE = e();
            int i = dgiw.a;
            dhja.c("Loading configuration with %s key", true != zE ? "old" : "new");
            if (zE) {
                deviceId = dgiw.a(context);
            } else {
                try {
                    try {
                        deviceId = dhkv.g(context).a.getDeviceId();
                    } catch (SecurityException e) {
                        throw new dhkf("READ_PRIVILEGED_PHONE_STATE permission is missing.", e);
                    }
                } catch (dhkf unused) {
                    dhja.g("No permissions to get device id", new Object[0]);
                    deviceId = null;
                }
            }
            Cipher cipherB = dgiw.b(2, deviceId);
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("rcsconfig");
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new CipherInputStream(fileInputStreamOpenFileInput, cipherB));
                Object object = objectInputStream.readObject();
                objectInputStream.close();
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
                dgiqVar = (dgiq) object;
            } finally {
            }
        } catch (FileNotFoundException e2) {
            cqca.j("RcsProvisioning", "Failed to read config: no config found %s", e2.getMessage());
        } catch (StreamCorruptedException unused2) {
            cqca.i("RcsProvisioning", "Failed to read configuration: obsolete encryption");
        } catch (Exception e3) {
            cqca.p("RcsProvisioning", e3, "Failed to read configuration: ".concat(String.valueOf(e3.getMessage())));
        }
        if (dgiqVar == null) {
            Configuration.Token tokenB = b();
            Configuration configuration = new Configuration();
            configuration.K(tokenB);
            return configuration;
        }
        if (e()) {
            return dgiqVar;
        }
        cqca.i("RcsProvisioning", "Migrating RCS config encryption key...");
        try {
            Context context2 = this.a;
            Cipher cipherB2 = dgiw.b(1, dgiw.a(context2));
            FileOutputStream fileOutputStreamOpenFileOutput = context2.openFileOutput("rcsconfig", 0);
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new CipherOutputStream(fileOutputStreamOpenFileOutput, cipherB2));
                objectOutputStream.writeObject(dgiqVar);
                objectOutputStream.flush();
                objectOutputStream.close();
                if (fileOutputStreamOpenFileOutput != null) {
                    fileOutputStreamOpenFileOutput.close();
                }
                dhhb.h.e(1);
                return dgiqVar;
            } finally {
            }
        } catch (IOException | GeneralSecurityException e4) {
            cqca.p("RcsProvisioning", e4, "Failed to migrate encryption key: ".concat(String.valueOf(e4.getMessage())));
            return dgiqVar;
        }
    }

    public final dhgy d() {
        String strY;
        try {
            strY = this.c.k().y(this.a);
        } catch (Exception unused) {
            cqca.c("RcsProvisioning", "Exception while getting subscriber Id. Using default");
            strY = "default";
        }
        return new dhgy(this.a, (true != TextUtils.isEmpty(strY) ? strY : "default").concat(".tbak"));
    }
}
