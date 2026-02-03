package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes9.dex */
public final class C implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public C() {
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objB;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC0019a.a;
                objB = Chronology.CC.b(objectInput.readUTF());
                break;
            case 2:
                objB = ((ChronoLocalDate) objectInput.readObject()).B((LocalTime) objectInput.readObject());
                break;
            case 3:
                objB = ((ChronoLocalDateTime) objectInput.readObject()).y((ZoneOffset) objectInput.readObject()).v((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = v.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                t.d.getClass();
                objB = new v(LocalDate.of(i, b2, b3));
                break;
            case 5:
                w wVar = w.d;
                objB = w.i(objectInput.readByte());
                break;
            case 6:
                m mVar = (m) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                mVar.getClass();
                objB = new o(mVar, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                y.d.getClass();
                objB = new A(LocalDate.of(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                E.d.getClass();
                objB = new G(LocalDate.of(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = C0024f.e;
                objB = new C0024f(Chronology.CC.b(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objB;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractC0019a) obj).getId());
                return;
            case 2:
                C0023e c0023e = (C0023e) obj;
                objectOutput.writeObject(c0023e.a);
                objectOutput.writeObject(c0023e.b);
                return;
            case 3:
                j jVar = (j) obj;
                objectOutput.writeObject(jVar.a);
                objectOutput.writeObject(jVar.b);
                objectOutput.writeObject(jVar.c);
                return;
            case 4:
                v vVar = (v) obj;
                vVar.getClass();
                objectOutput.writeInt(j$.time.temporal.k.a(vVar, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.k.a(vVar, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.k.a(vVar, ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((w) obj).a);
                return;
            case 6:
                o oVar = (o) obj;
                objectOutput.writeObject(oVar.a);
                objectOutput.writeInt(j$.time.temporal.k.a(oVar, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.k.a(oVar, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.k.a(oVar, ChronoField.DAY_OF_MONTH));
                return;
            case 7:
                A a = (A) obj;
                a.getClass();
                objectOutput.writeInt(j$.time.temporal.k.a(a, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.k.a(a, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.k.a(a, ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                G g = (G) obj;
                g.getClass();
                objectOutput.writeInt(j$.time.temporal.k.a(g, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.k.a(g, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.k.a(g, ChronoField.DAY_OF_MONTH));
                return;
            case 9:
                C0024f c0024f = (C0024f) obj;
                objectOutput.writeUTF(c0024f.a.getId());
                objectOutput.writeInt(c0024f.b);
                objectOutput.writeInt(c0024f.c);
                objectOutput.writeInt(c0024f.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public C(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
