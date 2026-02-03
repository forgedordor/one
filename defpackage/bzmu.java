package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmu implements bzmx {
    public final bmqz a;
    private final bmra b;
    private final int c;

    public /* synthetic */ bzmu(bmqz bmqzVar, bmra bmraVar) {
        int i;
        switch (bmraVar) {
            case BACKUP_KEY_OBJECT:
            case ENCRYPTION_KEY_OBJECT:
                i = 7;
                break;
            case PARTICIPANT:
                i = 3;
                break;
            case CONVERSATION:
                i = 2;
                break;
            case MESSAGE_OBJECT:
                i = 1;
                break;
            case MESSAGE_PART:
                i = 5;
                break;
            case UNKNOWN_CMS_DATA_TYPE:
                i = -1;
                break;
            default:
                throw new fctg();
        }
        bmqzVar.getClass();
        bmraVar.getClass();
        this.a = bmqzVar;
        this.b = bmraVar;
        this.c = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    @Override // defpackage.bzmx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.embz r5) throws defpackage.bzmw {
        /*
            r4 = this;
            bmra r0 = r4.b
            bmqz r1 = r4.a
            int r2 = r1.ordinal()
            switch(r2) {
                case 0: goto L71;
                case 1: goto L71;
                case 2: goto L1e;
                case 3: goto L14;
                case 4: goto L1e;
                case 5: goto L14;
                case 6: goto L14;
                case 7: goto L14;
                case 8: goto L14;
                case 9: goto L11;
                case 10: goto L1e;
                case 11: goto L1e;
                default: goto Lb;
            }
        Lb:
            fctg r5 = new fctg
            r5.<init>()
            throw r5
        L11:
            emcd r0 = defpackage.emcd.UNSPECIFIED_BACKUP_TYPE
            goto L36
        L14:
            bmra r2 = defpackage.bmra.MESSAGE_PART
            if (r0 != r2) goto L1b
            emcd r0 = defpackage.emcd.PARTS_UPDATE
            goto L36
        L1b:
            emcd r0 = defpackage.emcd.UNSPECIFIED_BACKUP_TYPE
            goto L36
        L1e:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L34;
                case 1: goto L34;
                case 2: goto L31;
                case 3: goto L2e;
                case 4: goto L2b;
                case 5: goto L11;
                case 6: goto L11;
                default: goto L25;
            }
        L25:
            fctg r5 = new fctg
            r5.<init>()
            throw r5
        L2b:
            emcd r0 = defpackage.emcd.MESSAGE_BACKUP
            goto L36
        L2e:
            emcd r0 = defpackage.emcd.CONVERSATION_BACKUP
            goto L36
        L31:
            emcd r0 = defpackage.emcd.PARTICIPANT_BACKUP
            goto L36
        L34:
            emcd r0 = defpackage.emcd.KEY_BACKUP
        L36:
            r5.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r5.instance
            emca r2 = (defpackage.emca) r2
            emca r3 = defpackage.emca.a
            int r0 = r0.w
            r2.c = r0
            int r0 = r2.b
            r3 = 1
            r0 = r0 | r3
            r2.b = r0
            int r0 = r1.ordinal()
            switch(r0) {
                case 0: goto L6b;
                case 1: goto L6b;
                case 2: goto L58;
                case 3: goto L58;
                case 4: goto L58;
                case 5: goto L58;
                case 6: goto L58;
                case 7: goto L58;
                case 8: goto L58;
                case 9: goto L59;
                case 10: goto L56;
                case 11: goto L58;
                default: goto L50;
            }
        L50:
            fctg r5 = new fctg
            r5.<init>()
            throw r5
        L56:
            r3 = 2
            goto L59
        L58:
            r3 = 3
        L59:
            r5.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r5.instance
            emca r5 = (defpackage.emca) r5
            int r3 = r3 + (-1)
            r5.g = r3
            int r0 = r5.b
            r0 = r0 | 16
            r5.b = r0
            return
        L6b:
            bzmw r5 = new bzmw
            r5.<init>()
            throw r5
        L71:
            bzmw r5 = new bzmw
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzmu.a(embz):void");
    }

    @Override // defpackage.bzmx
    public final void b(emcw emcwVar) throws bzmw {
        emec emecVar;
        switch (this.a) {
            case INITIAL_RESTORE_NON_RETRIABLE:
            case INITIAL_RESTORE_MAX_RETRIED:
                switch (this.b) {
                    case BACKUP_KEY_OBJECT:
                        emecVar = emec.RESTORE_BACKUP_KEY;
                        break;
                    case ENCRYPTION_KEY_OBJECT:
                        emecVar = emec.RESTORE_ENCRYPTION_KEY;
                        break;
                    case PARTICIPANT:
                        emecVar = emec.RESTORE_PARTICIPANT;
                        break;
                    case CONVERSATION:
                        emecVar = emec.RESTORE_CONVERSATION;
                        break;
                    case MESSAGE_OBJECT:
                    case MESSAGE_PART:
                        emecVar = emec.RESTORE_MESSAGE;
                        break;
                    case UNKNOWN_CMS_DATA_TYPE:
                        emecVar = emec.RESTORE;
                        break;
                    default:
                        throw new fctg();
                }
            case BACKUP_CREATE:
            case BACKUP_UPDATE:
            case BACKUP_DELETE:
            case BACKUP_UPDATE_FREQUENT:
            case BACKUP_UPDATE_RARE:
            case BACKUP_UPDATE_ADDITIONAL_FIELDS:
            case BACKUP_UPDATE_URI:
            case BACKUP_UNKNOWN_OPERATION:
            case INCREMENTAL_BACKUP_CREATE:
                throw new bzmw();
            case INITIAL_BACKUP_CREATE:
                emecVar = emec.BACKUP;
                break;
            default:
                throw new fctg();
        }
        emcwVar.copyOnWrite();
        emcx emcxVar = (emcx) emcwVar.instance;
        emcx emcxVar2 = emcx.a;
        emcxVar.c = emecVar.s;
        emcxVar.b |= 1;
    }

    @Override // defpackage.bzmx
    public final void c(bmoy bmoyVar) {
        bmoyVar.c(this.a);
        bmoyVar.j(this.b);
        bmoyVar.h(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzmu)) {
            return false;
        }
        bzmu bzmuVar = (bzmu) obj;
        return this.a == bzmuVar.a && this.b == bzmuVar.b && this.c == bzmuVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "FailureContext(abandonedAction=" + this.a + ", cmsDataType=" + this.b + ", bugleTableType=" + this.c + ")";
    }
}
