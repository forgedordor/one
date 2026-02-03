package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
enum ebdh implements ebrw {
    INIT,
    ACTIVE,
    CLOSING,
    CLOSED,
    FAILED;

    public static final ebrv f;

    static {
        ebdh ebdhVar = INIT;
        ebdh ebdhVar2 = ACTIVE;
        ebdh ebdhVar3 = CLOSING;
        ebdh ebdhVar4 = CLOSED;
        ebdh ebdhVar5 = FAILED;
        ekhy ekhyVar = new ekhy();
        ekhyVar.d(ebdhVar, ebdhVar2, ebdhVar3);
        ekhyVar.d(ebdhVar2, ebdhVar2, ebdhVar3);
        ekhyVar.d(ebdhVar3, ebdhVar4);
        f = new ebrv(ebdhVar, ebdhVar5, ekhyVar.a(), ekoj.a);
    }
}
