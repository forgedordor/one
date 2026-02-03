package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akjx implements Comparator {
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        fdap fdapVar = akkc.a;
        alqm alqmVarG = ((ResolvedRecipient) obj).g();
        alqmVarG.getClass();
        ?? Invoke = fdapVar.invoke(alqmVarG);
        alqm alqmVarG2 = ((ResolvedRecipient) obj2).g();
        alqmVarG2.getClass();
        return fcxl.a(Invoke, fdapVar.invoke(alqmVarG2));
    }
}
