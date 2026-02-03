package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class econ implements fcsu {
    private static final Charset d;
    private static final List e;
    public volatile ecom c;
    private final String f;
    public final Object b = new Object();
    public final Map a = new HashMap(10);

    static {
        new econ("");
        d = Charset.forName("UTF-8");
        e = new ArrayList();
    }

    private econ(String str) {
        this.f = str;
    }

    public static long a(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(d));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static synchronized econ e(String str) {
        List<econ> list = e;
        for (econ econVar : list) {
            if (econVar.f.equals(str)) {
                return econVar;
            }
        }
        econ econVar2 = new econ(str);
        list.add(econVar2);
        return econVar2;
    }

    @Override // defpackage.fcsu
    public final /* synthetic */ Object b() {
        return this.c;
    }

    public final ecoe c(String str, ecoi... ecoiVarArr) {
        synchronized (this.b) {
            Map map = this.a;
            ecoe ecoeVar = (ecoe) map.get(str);
            if (ecoeVar != null) {
                ecoeVar.f(ecoiVarArr);
                return ecoeVar;
            }
            ecoe ecoeVar2 = new ecoe(str, this, ecoiVarArr);
            map.put(ecoeVar2.b, ecoeVar2);
            return ecoeVar2;
        }
    }

    public final ecog d(String str, ecoi... ecoiVarArr) {
        synchronized (this.b) {
            Map map = this.a;
            ecog ecogVar = (ecog) map.get(str);
            if (ecogVar != null) {
                ecogVar.f(ecoiVarArr);
                return ecogVar;
            }
            ecog ecogVar2 = new ecog(str, this, ecoiVarArr);
            map.put(ecogVar2.b, ecogVar2);
            return ecogVar2;
        }
    }
}
