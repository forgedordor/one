package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.rcsmigration.File;
import j$.net.URLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhbm {
    private static dhbm a;

    private dhbm() {
    }

    public static dhbm a() {
        if (a == null) {
            a = new dhbm();
        }
        return a;
    }

    public static final String c(dgix dgixVar) {
        String str;
        ImsConfiguration imsConfigurationN = dgixVar.c().n();
        if (imsConfigurationN == null || (str = imsConfigurationN.mPublicIdentity) == null) {
            return null;
        }
        try {
            return a.x(URLEncoder.encode(str, StandardCharsets.UTF_8.name()), "_groupsessions.xml");
        } catch (UnsupportedEncodingException e) {
            dhja.i(e, "URLEncoder does not support UTF-8 encoding", new Object[0]);
            return null;
        }
    }

    public static final File d(Context context, String str) throws IOException {
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            dclh.m(fileInputStreamOpenFileInput);
            byte[] bArr = new byte[4096];
            while (true) {
                int i = fileInputStreamOpenFileInput.read(bArr);
                if (i == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dhji.a(fileInputStreamOpenFileInput);
                    return new File(str, byteArray);
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (FileNotFoundException e) {
            dhja.i(e, "File not found.", new Object[0]);
            return null;
        } catch (IOException e2) {
            dhja.i(e2, "Error while converting file to byte[]", new Object[0]);
            return null;
        }
    }

    public final synchronized void b(Context context, dgix dgixVar) {
        dhja.c("Clearing legacy data", new Object[0]);
        dhgz dhgzVar = new dhgz(context);
        dgixVar.c().C();
        cqca.c("RcsProvisioning", "Clearing backup token");
        dhgy dhgyVarD = dgixVar.d();
        dhgyVarD.f("token_value");
        dhgyVarD.f("token_expiration");
        dfdj dfdjVar = new dfdj(context);
        dfdjVar.a();
        dfdjVar.close();
        dhja.k("Deleted transfers file: %s", Boolean.valueOf(new java.io.File("httpft_pending").delete()));
        String strC = c(dgixVar);
        if (strC != null) {
            dhja.k("Deleted conferences file: %s", Boolean.valueOf(new java.io.File(strC).delete()));
        }
        dhgy dhgyVar = dhgzVar.a;
        dhgyVar.f("msisdn");
        dhgyVar.f("sim_serial_number");
        dhgyVar.f("sessionid");
    }
}
