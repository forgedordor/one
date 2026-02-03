package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgif implements Serializable {
    private static final long serialVersionUID = 3339215700684575599L;
    public String a;
    public String b;
    private long c;
    private long d;

    public dgif(HttpCookie httpCookie) {
        if (httpCookie == null) {
            throw new NullPointerException("cookie parameter must not be null");
        }
        this.d = httpCookie.getMaxAge();
        this.c = dhkl.a().longValue();
        this.a = httpCookie.getName();
        this.b = httpCookie.getValue();
    }

    public static String a(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dgif dgifVar = (dgif) it.next();
            long j = dgifVar.d;
            if (j != 0 && (j == -1 || TimeUnit.MILLISECONDS.toSeconds(dhkl.a().longValue() - dgifVar.c) <= dgifVar.d)) {
                if (sb.length() > 0) {
                    sb.append("; ");
                }
                sb.append(String.format("%1$s=%2$s", dgifVar.a, dgifVar.b));
            }
        }
        return sb.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (String) objectInputStream.readObject();
        this.b = (String) objectInputStream.readObject();
        this.d = objectInputStream.readLong();
        this.c = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b);
        objectOutputStream.writeLong(this.d);
        objectOutputStream.writeLong(this.c);
    }
}
