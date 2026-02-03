package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbrk {
    public final fbrj a;
    public final String b;
    public final String c;
    public final fbri d;
    public final fbri e;
    public final boolean f;

    public fbrk(fbrj fbrjVar, String str, fbri fbriVar, fbri fbriVar2, boolean z) {
        new AtomicReferenceArray(2);
        fbrjVar.getClass();
        this.a = fbrjVar;
        str.getClass();
        this.b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        fbriVar.getClass();
        this.d = fbriVar;
        fbriVar2.getClass();
        this.e = fbriVar2;
        this.f = z;
    }

    public static fbrh a() {
        fbrh fbrhVar = new fbrh();
        fbrhVar.a = null;
        fbrhVar.b = null;
        return fbrhVar;
    }

    public static String c(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + "/" + str2;
    }

    public final InputStream b(Object obj) {
        return this.d.a(obj);
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("fullMethodName", this.b);
        ejwfVarB.b(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.a);
        ejwfVarB.h("idempotent", false);
        ejwfVarB.h("safe", false);
        ejwfVarB.h("sampledToLocalTracing", this.f);
        ejwfVarB.b("requestMarshaller", this.d);
        ejwfVarB.b("responseMarshaller", this.e);
        ejwfVarB.b("schemaDescriptor", null);
        ejwfVarB.c();
        return ejwfVarB.toString();
    }
}
