package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbtx extends fbmz {
    public static final Logger a = Logger.getLogger(fbtx.class.getName());
    private static final fbtv g;
    private static final Class h;
    private static final Class i;
    public final boolean b;
    public final ejaq c;
    public fbrg d;
    public Map e;
    public final boolean f;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:28|3)|(2:30|4)|11|26|12|13|16|24|17|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        defpackage.fbtx.a.logp(java.util.logging.Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadGoogleCredentialsClass", "Failed to load GoogleCredentials", (java.lang.Throwable) r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        defpackage.fbtx.a.logp(java.util.logging.Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadAppEngineCredentials", "AppEngineCredentials not available in classloader", (java.lang.Throwable) r0);
     */
    static {
        /*
            java.lang.Class<fbtx> r0 = defpackage.fbtx.class
            java.lang.String r1 = r0.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            defpackage.fbtx.a = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            java.lang.String r2 = "ejbf"
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r3, r0)     // Catch: java.lang.ClassNotFoundException -> L2f
            fbtv r3 = new fbtv     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.ClassNotFoundException -> L20
            r3.<init>(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.ClassNotFoundException -> L20
            goto L30
        L1e:
            r0 = move-exception
            goto L21
        L20:
            r0 = move-exception
        L21:
            r7 = r0
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r6 = "Failed to create JWT helper. This is unexpected"
            java.util.logging.Logger r2 = defpackage.fbtx.a
            java.lang.String r4 = "io.grpc.auth.GoogleAuthLibraryCallCredentials"
            java.lang.String r5 = "createJwtHelperOrNull"
            r2.logp(r3, r4, r5, r6, r7)
        L2f:
            r3 = r1
        L30:
            defpackage.fbtx.g = r3
            java.lang.String r0 = "ejav"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L3f
            java.lang.Class<ejaq> r2 = defpackage.ejaq.class
            java.lang.Class r0 = r0.asSubclass(r2)
            goto L4f
        L3f:
            r0 = move-exception
            r7 = r0
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r6 = "Failed to load GoogleCredentials"
            java.util.logging.Logger r2 = defpackage.fbtx.a
            java.lang.String r4 = "io.grpc.auth.GoogleAuthLibraryCallCredentials"
            java.lang.String r5 = "loadGoogleCredentialsClass"
            r2.logp(r3, r4, r5, r6, r7)
            r0 = r1
        L4f:
            defpackage.fbtx.h = r0
            java.lang.String r0 = "com.google.auth.appengine.AppEngineCredentials"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L58
            goto L67
        L58:
            r0 = move-exception
            r7 = r0
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r6 = "AppEngineCredentials not available in classloader"
            java.util.logging.Logger r2 = defpackage.fbtx.a
            java.lang.String r4 = "io.grpc.auth.GoogleAuthLibraryCallCredentials"
            java.lang.String r5 = "loadAppEngineCredentials"
            r2.logp(r3, r4, r5, r6, r7)
        L67:
            defpackage.fbtx.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbtx.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fbtx(defpackage.ejaq r11) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r10 = this;
            fbtv r0 = defpackage.fbtx.g
            r10.<init>()
            java.lang.Class r1 = defpackage.fbtx.h
            r2 = 0
            if (r1 == 0) goto Lf
            boolean r1 = r1.isInstance(r11)
            goto L10
        Lf:
            r1 = r2
        L10:
            if (r0 == 0) goto L80
            java.lang.Class r3 = r0.a
            boolean r3 = r3.isInstance(r11)
            if (r3 != 0) goto L1c
            goto L80
        L1c:
            java.lang.Class r3 = r0.a     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L6e
            java.lang.Object r3 = r3.cast(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L6e
            ejaq r3 = (defpackage.ejaq) r3     // Catch: java.lang.reflect.InvocationTargetException -> L6b java.lang.IllegalAccessException -> L6e
            java.lang.reflect.Method r11 = r0.d     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            r4 = 0
            java.lang.Object r11 = r11.invoke(r3, r4)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.util.Collection r11 = (java.util.Collection) r11     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            int r11 = r11.size()     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            if (r11 != 0) goto L67
            java.lang.reflect.Method r11 = r0.b     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.lang.Object r11 = r11.invoke(r4, r4)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.util.List r5 = r0.e     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
        L3f:
            boolean r6 = r5.hasNext()     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            if (r6 == 0) goto L5e
            java.lang.Object r6 = r5.next()     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            fbtw r6 = (defpackage.fbtw) r6     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.lang.reflect.Method r7 = r6.b     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.lang.reflect.Method r6 = r6.a     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.lang.Object r6 = r6.invoke(r3, r4)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            r8[r2] = r6     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            r7.invoke(r11, r8)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            goto L3f
        L5c:
            r0 = move-exception
            goto L70
        L5e:
            java.lang.reflect.Method r0 = r0.c     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            java.lang.Object r11 = r0.invoke(r11, r4)     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            ejaq r11 = (defpackage.ejaq) r11     // Catch: java.lang.IllegalAccessException -> L5c java.lang.reflect.InvocationTargetException -> L69
            goto L80
        L67:
            r11 = r3
            goto L80
        L69:
            r0 = move-exception
            goto L70
        L6b:
            r0 = move-exception
            r9 = r0
            goto L73
        L6e:
            r0 = move-exception
            r3 = r11
        L70:
            r11 = r0
            r9 = r11
            r11 = r3
        L73:
            java.util.logging.Logger r4 = defpackage.fbtx.a
            java.util.logging.Level r5 = java.util.logging.Level.WARNING
            java.lang.String r7 = "tryServiceAccountToJwt"
            java.lang.String r8 = "Failed converting service account credential to JWT. This is unexpected"
            java.lang.String r6 = "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper"
            r4.logp(r5, r6, r7, r8, r9)
        L80:
            r10.b = r1
            r10.c = r11
            java.lang.Class r0 = defpackage.fbtx.i
            if (r0 != 0) goto L8b
            r10.f = r2
            return
        L8b:
            boolean r11 = r0.isInstance(r11)
            r10.f = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbtx.<init>(ejaq):void");
    }

    public static void a(String str, fbrk fbrkVar) throws StatusException {
        try {
            URI uri = new URI("https", str, "/".concat(String.valueOf(fbrkVar.c)), null, null);
            if (uri.getPort() == 443) {
                b(uri);
            }
        } catch (URISyntaxException e) {
            throw Status.j.withDescription("Unable to construct service URI for auth").d(e).asException();
        }
    }

    private static void b(URI uri) throws StatusException {
        try {
            new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw Status.j.withDescription("Unable to construct service URI after removing port").d(e).asException();
        }
    }
}
