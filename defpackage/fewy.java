package defpackage;

import org.apache.commons.codec.BinaryEncoder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fewy {
    public static fewy a;

    static {
        try {
            a = (fewy) Class.forName(fews.a("net.fortuna.ical4j.factory.encoder")).newInstance();
        } catch (Exception unused) {
            a = new fewx();
        }
    }

    public abstract BinaryEncoder a(feti fetiVar);
}
