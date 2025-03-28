package fidelitasvirtual.org.models;

import java.time.LocalDateTime;

public class Ticket {
    /**
     * Esta clase representa un tiquete de servicio.
     */
    private final Client client;
    private final LocalDateTime createdAt;
    private LocalDateTime closedAt;
    private final String ticketType;

    public Ticket(Client client, String ticketType) {
        this.client = client;
        this.createdAt = LocalDateTime.now();
        this.ticketType = ticketType;
    }
    public Client getClient() {
        return client;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getClosedAt() {
        return closedAt;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setClosedAt(LocalDateTime closedAt) {
        this.closedAt = LocalDateTime.now();
    }
    @Override
    public String toString() {
        return "Ticket [client_id=" + client.getId() + ", createdAt=" + createdAt + ", closedAt=" + closedAt + ", ticketType=" + ticketType + "]";
    }
}
