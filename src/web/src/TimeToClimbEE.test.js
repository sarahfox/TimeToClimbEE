import { render, screen } from '@testing-library/react';
import TimeToClimbEE from './TimeToClimbEE';

test('renders learn react link', () => {
  render(<TimeToClimbEE />);
  const linkElement = screen.getByText(/learn react/i);
  expect(linkElement).toBeInTheDocument();
});
