package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfsq {
    public static final dhip a = new dhip("ReceiveMessageProducerModule");
    public static final dfny b = dfod.a(189946440);
    public static final dfny c = dfod.a(190862270);

    public static Object a(eyiq eyiqVar) {
        try {
            Object objA = eyiqVar.a();
            if (objA != null) {
                return objA;
            }
            throw new IllegalStateException("No result produced.");
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }
}
