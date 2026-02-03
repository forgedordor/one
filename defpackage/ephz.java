package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ephz {
    public final ekhx a;

    public ephz(ekhx ekhxVar) {
        ekhv ekhvVarI = ekhx.i(ekhxVar.size());
        ekqg ekqgVarListIterator = ekhxVar.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            ekhvVarI.c(ejuf.d((String) ekqgVarListIterator.next()));
        }
        this.a = ekhvVarI.g();
    }
}
